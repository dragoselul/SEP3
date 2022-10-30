package via.sdj3.slaughterhouse.Model;

import io.grpc.stub.StreamObserver;
import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToFile;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.slaughterhouse.Interface.SlaughterHouse;
import via.sdj3.slaughterhouse.protobuf.Animal;
import via.sdj3.slaughterhouse.protobuf.Package;
import via.sdj3.slaughterhouse.protobuf.Packages;
import via.sdj3.slaughterhouse.protobuf.RegistrationNumbers;
import via.sdj3.slaughterhouse.protobuf.SlaughterHouseGrpc.SlaughterHouseImplBase;

@GRpcService
public class SlaughterHouseImpl extends SlaughterHouseImplBase {

    private final SlaughterHouse slaughterHouse;

    public SlaughterHouseImpl(SlaughterHouse slaughterHouse) {
        this.slaughterHouse = slaughterHouse;
    }
    @Override
    public void retrieveRegNumber(Package request, StreamObserver<RegistrationNumbers> responseObserver) {
        System.out.println("We got this " + request);
        RegistrationNumbers registrationNumbers = slaughterHouse.retrieveRegNumber(request);
        System.out.println(registrationNumbers);
        responseObserver.onNext(registrationNumbers);
        responseObserver.onCompleted();
    }

    @Override
    public void retrievePackage(Animal request, StreamObserver<Packages> responseObserver) {
        System.out.println("The animal inputted: " + request);
        Packages packages = slaughterHouse.retrievePackage(request);
        System.out.println(packages);
        responseObserver.onNext(packages);
        responseObserver.onCompleted();
    }
}
