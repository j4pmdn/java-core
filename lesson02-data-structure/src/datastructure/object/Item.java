package datastructure.object;
/*

 Có 2 loại KDL
 1. kiểu nguyên thủy
 --> int, char, double, long
 --> chỉ sử dụng các KDL có sẵn của Java

 2. Kiểu đối tượng
 --> Integer, Double, Float --> KDL có sẵn của Java
 --> Item, Employee, Store --> KDL do mình tự khai báo, khởi tạo thêm tùy bài toán
 
 VD: Mặt hàng: mã mặt hàng, tên mặt hàng, giá bán
 	 Item: id, name, salesPrice
 */

// Item là kiểu dữ liệu, ngang hàng với int
// int a = ?
// Item b = ?
public class Item {
	
	// thuộc tính của KDL Item
	// khi tạo biến có KDL Item --> biến đó luôn có 3 thông tin(id, name, salesPrice)
	int id;
	char name;
	double salesPrice;
	
}
