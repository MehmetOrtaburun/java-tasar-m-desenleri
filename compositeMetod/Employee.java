package compositeMetod;

public interface Employee {
    // Parça bütün ilişkileri için nesneler ağaç yapısındadır.
    //istemciler tek olan parçalar ile bütün olan composite nesneleri
    // aynı şekilde kullanabilmek isterler
    // Compsite kalıbında öncelikle parçalar ile bütün ortak bir arayüze sahiptir.



    void showEmployeeDetails();

    // bu interface den implemente olan iki sınıf olsun
    // Developer ve Manager



}
