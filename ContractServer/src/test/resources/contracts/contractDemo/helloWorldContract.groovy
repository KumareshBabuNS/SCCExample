/**
 * Created by vupadhya on 1/12/17.
 */
package contracts.contractDemo

org.springframework.cloud.contract.spec.Contract.make {
            request {

                method 'GET'
                url '/hello'
            }
            response {
                status 200
                body("Hello World")
            }
        }
