// Bu kod, bir dizideki en büyük elemanı bulur.
// Dizi üzerinde lineer bir arama yaparak en büyük elemanı tespit eder.

#include <iostream>
#include <climits> // INT_MIN için gerekli

using namespace std;

/**
 * Dizideki en büyük elemanı bulur.
 *
 * @param arr Dizi.
 * @param size Dizinin boyutu.
 * @return En büyük eleman.
 */
int findMaxElement(int arr[], int size) {
    if (size <= 0) {
        cerr << "Dizi boş veya geçersiz boyutta!" << endl;
        return INT_MIN; // Hata durumunda INT_MIN döndür
    }

    int maxElement = arr[0]; // İlk elemanı en büyük olarak varsay
    for (int i = 1; i < size; i++) {
        if (arr[i] > maxElement) {
            maxElement = arr[i]; // Daha büyük bir eleman bulunduğunda güncelle
        }
    }
    return maxElement;
}

// Örnek kullanım
int main() {
    int numbers[] = {10, 20, 30, 40, 50};
    int size = sizeof(numbers) / sizeof(numbers[0]);

    int maxNumber = findMaxElement(numbers, size);
    cout << "Dizideki en büyük eleman: " << maxNumber << endl;

    return 0;
}
