package via.sdj3.slaughterhouse.Interface;

import via.sdj3.slaughterhouse.protobuf.Animal;
import via.sdj3.slaughterhouse.protobuf.Package;
import via.sdj3.slaughterhouse.protobuf.Packages;
import via.sdj3.slaughterhouse.protobuf.RegistrationNumbers;

public interface SlaughterHouse {
    RegistrationNumbers retrieveRegNumber(Package pack);
    Packages retrievePackage(Animal animal);
}
