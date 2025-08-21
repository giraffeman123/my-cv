import { DynamoDBClient } from "@aws-sdk/client-dynamodb";
import { DynamoDBDocumentClient, GetCommand } from "@aws-sdk/lib-dynamodb";

// Create vanilla DynamoDB client
const ddbClient = new DynamoDBClient({ region: "us-east-2" }); // Set your region
const docClient = DynamoDBDocumentClient.from(ddbClient);

/**
 *
 * Event doc: https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-lambda-proxy-integrations.html#api-gateway-simple-proxy-for-lambda-input-format
 * @param {Object} event - API Gateway Lambda Proxy Input Format
 *
 * Context doc: https://docs.aws.amazon.com/lambda/latest/dg/nodejs-prog-model-context.html 
 * @param {Object} context
 *
 * Return doc: https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-lambda-proxy-integrations.html
 * @returns {Object} object - API Gateway Lambda Proxy Output Format
 * 
 */

export const lambdaHandler = async (event, context) => {

  var id = "1";
  var params = {
    TableName: "my-cv",
    Key: {
      "CVID": id
    }
  }

  
  var result = null; var response = {};
  
  try{
    const result = await docClient.send(new GetCommand(params));
    if(result.Item != null){
      response = {
        statusCode: 200,
        body: result.Item,
      };
    }else{
      response = {
        statusCode: 200,
        body: {},
      };      
    }
  }catch(err){    
    response = {
      statusCode: 500,
      body: JSON.stringify(err.message),
    };    
  }
  return response;    
};
