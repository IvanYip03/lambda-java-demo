package com.demo;

import com.alibaba.fastjson.JSONObject;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;

public class HelloWorld implements RequestHandler<APIGatewayProxyRequestEvent, String> {

    @Override
    public String handleRequest(APIGatewayProxyRequestEvent event, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("event : " + JSONObject.toJSONString(event, true));
        logger.log("context : " + JSONObject.toJSONString(context, true));
        return "Hello World";
    }
}
