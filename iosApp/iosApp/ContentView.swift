import SwiftUI
import Shared

struct ContentView: View {
    @ObservedObject private(set) var viewModel: ViewModel
    // let jsonResponseAsText = MindfulnessBooksApiImpl().getJsonFromApi()
    
    
    var body: some View {
        Text(viewModel.jsonResponseAsText)
    }
}



extension ContentView {
    class ViewModel: ObservableObject {
        @Published var jsonResponseAsText = "Loading..."
        init() {
            MindfulnessBooksApiImpl().getJsonFromApi() {
                mindfulnessBooksApiImpl, error in
                DispatchQueue.main.async {
                    if let mindfulnessBooksApiImpl = mindfulnessBooksApiImpl {
                        self.jsonResponseAsText = mindfulnessBooksApiImpl
                    } else {
                        self.jsonResponseAsText = error?.localizedDescription ?? "error"
                    }
                }
            }
            }

        }
    }

        //            Greeting().greeting { greeting, error in
        //                DispatchQueue.main.async {
        //                    if let greeting = greeting {
        //                        self.text = greeting
        //                    } else {
        //                        self.text = error?.localizedDescription ?? "error"
        //                    }
        //                }
        //            }

       // struct ContentView_Previews: PreviewProvider {
        //    static var previews: some View {
        //        ContentView()
        //    }
        //}
