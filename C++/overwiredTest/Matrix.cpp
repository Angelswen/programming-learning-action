#include"Matrix.h"
#include<iostream>
#include<iomanip>
using namespace std;

//重载操作符+
Matrix Matrix::operator+(Matrix& m){
	Matrix tmp;
	for(i=0;i<Row;i++){
			for(j=0;j<Col;j++){
				tmp.a[i][j] = a[i][j] + m.a[i][j];
			}
		}
	return tmp;
}
//重载操作符-
Matrix Matrix::operator-(Matrix& m){
	Matrix tmp;
	for(i=0;i<Row;i++){
			for(j=0;j<Col;j++){
				tmp.a[i][j] = a[i][j] - m.a[i][j];
			}
		}
	return tmp;
}
//数据输入函数
void Matrix::input(){
	cout<<"请输入"<<Row<<"*"<<Col<<"个数: ";
	for(i=0;i<Row;i++){
			for(j=0;j<Col;j++){
				cin>>a[i][j];
			}
		}
}
//重载操作符<<,返回输出流引用
ostream & operator<<(ostream &out,Matrix &m){
	int i,j;
	for(i=0;i<Row;i++){
		for(j=0;j<Col;j++){
			out<<setw(5)<<m.a[i][j];
			}
		out<<endl;
    }
	return out;
}


