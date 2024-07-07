package data.network

import data.utils.BASE_URL
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

/**
 *  This class executes network requests and deserializes JSON responses into entities.
 * The Ktor HttpClient instance initializes and stores the httpClient property.
 */


abstract class KtorApi {
     val httpClient = HttpClient {
        install(ContentNegotiation){
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })

        }
//        install(ContentNegotiation) {
//
//            json(
//                Json {
//                    ignoreUnknownKeys = true
//                    isLenient = true
//
//                }
//            )
//
//
//        }
//        install(Logging) {
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
//
//    fun HttpRequestBuilder.pathUrl(path: String) {
//        url {
//            takeFrom(BASE_URL)
//            path(path)
//            //parameter("api_key", API_KEY)
//        }
//    }

    }
}