package via.sdj3.slaughterhouse.databaseGen;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.slaughterhouse.protobuf.Animal;
import via.sdj3.slaughterhouse.protobuf.Package;
import via.sdj3.slaughterhouse.protobuf.Packages;
import via.sdj3.slaughterhouse.protobuf.RegistrationNumbers;
import via.sdj3.slaughterhouse.protobuf.SlaughterHouseGrpc.SlaughterHouseImplBase;

@GRpcService
public class SlaughterHouse extends SlaughterHouseImplBase {
    @Override
    public void retrieveRegNumber(Package request, StreamObserver<RegistrationNumbers> responseObserver) {
        super.retrieveRegNumber(request, responseObserver);
    }

    @Override
    public void retrievePackage(Animal request, StreamObserver<Packages> responseObserver) {
        super.retrievePackage(request, responseObserver);
    }
}
