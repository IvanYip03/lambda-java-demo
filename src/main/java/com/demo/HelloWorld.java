package com.demo;

import com.alibaba.fastjson.JSONObject;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

import java.util.Collections;

public class HelloWorld implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent event, Context context) {

        APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
        responseEvent.setHeaders(Collections.emptyMap());
        responseEvent.setIsBase64Encoded(false);

        try {

            LambdaLogger logger = context.getLogger();
            logger.log("event : " + JSONObject.toJSONString(event, true));
            logger.log("context : " + JSONObject.toJSONString(context, true));


            responseEvent.setBody("Hello World");
            responseEvent.setStatusCode(200);
            return responseEvent;

        } catch (Exception ex) {

            responseEvent.setBody("Bye Bye");
            responseEvent.setStatusCode(500);
            return responseEvent;

        }
    }
}