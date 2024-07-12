package data.network

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.http.path
import io.ktor.http.takeFrom
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

/**
 *  This class executes network requests and deserializes JSON responses into entities.
 * The Ktor HttpClient instance initializes and stores the httpClient property.
 */

private const val BASE_URL = "http://81.16.28.68/"



abstract class KtorApi {
    val client = HttpClient {
        install(ContentNegotiation) {

            json(
                Json {
                    ignoreUnknownKeys = true
                    isLenient = true

                }
            )


        }
        //        install(loggin) {
//            level = LogLevel.HEADERS
//            logger = object : Logger {
//                override fun log(message: String) {
//                    Napier.i(tag = "Http Client", message = message)
//                }
//            }
//        }.also {
//            Napier.base(DebugAntilog())
//        }
//    }


    }
    fun HttpRequestBuilder.pathUrl(path: String) {
        url {
            takeFrom(BASE_URL)
            path(path)
            //parameter("api_key", API_KEY)
        }
    }
}




