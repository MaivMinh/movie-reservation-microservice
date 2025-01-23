proto:
	protoc --proto_path=./app/api-gateway/src/main/proto --java_out=./app/api-gateway/src/main/java --grpc-java_out=./app/api-gateway/src/main/java ./app/api-gateway/src/main/proto/*.proto
	protoc --proto_path=./app/auth-service/src/main/proto --java_out=./app/auth-service/src/main/java --grpc-java_out=./app/auth-service/src/main/java ./app/auth-service/src/main/proto/*.proto
	protoc --proto_path=./app/bff/src/main/proto --java_out=./app/bff/src/main/java --grpc-java_out=./app/bff/src/main/java ./app/bff/src/main/proto/*.proto
	protoc --proto_path=./app/booking-service/src/main/proto --java_out=./app/booking-service/src/main/java --grpc-java_out=./app/booking-service/src/main/java ./app/booking-service/src/main/proto/*.proto
	protoc --proto_path=./app/movie-service/src/main/proto --java_out=./app/movie-service/src/main/java --grpc-java_out=./app/movie-service/src/main/java ./app/movie-service/src/main/proto/*.proto