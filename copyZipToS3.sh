# shellcheck disable=SC2164
cd /Users/ivanyip/Work/Sources/Private/Demo/lambda-java-demo/build/distributions/

aws s3 cp lambda-java-demo-1.0.zip s3://lambda-demo-artifacts/lambda-java-demo-1.0.zip --profile ivan@admin