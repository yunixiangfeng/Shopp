/*
   ʵ����Ʒ�Ŀ�����
     ����:
	    1. չʾ�û�ѡ�����嵥
		2. ����ѡ��Ĺ��ܱ��,���в�ͬ�Ĳ���
		   A. չʾ���п��
		   B. �޸Ŀ������
		   
	  ����:
	    1. չʾ�û��嵥:
		   ������, �û�����, ѡ�������
		2. ����ѡ��,���ò�ͬ�ķ���
		    switch���
			  case 1 2 3
		
		   A  չʾ���
		     ���洢��Ʒ������,����
		   B  �޸Ŀ��
		        
			  �޸����еĿ������
*/
/*
import java.util.Scanner;
public class Shopp{
	public static void main(String[] args){
		//ʹ������,������Ʒ����Ϣ
		//Ʒ��,�ߴ�,�۸�,�����,����5������
		String[] brand = {"MacBookAir","Thinkpad450"};
		double[] size ={13.3,15.60};
		double[] price = {9998.97,6789.56};
		int[] count = {0,0};
		while(true){
		int choose = chooseFunction();
		switch(choose){
			case 1:
			  //���ò鿴����嵥����
			  printStore(brand,size,price,count);
			break;
			
			case 2:
			  //�����޸Ŀ��ķ���
			  update(brand,count);
			break;
			
			case 3:
			  return ;
			 
			  
			  default:
			    System.out.println("û���������");
			  break;
		}
		}
	}
	/*
	  ���巽��,�޸�������Ʒ�Ŀ��
	    �û�����1��,�޸�1��
		����ֵ,û��
		����,�����������,Ʒ������
	*/
	public static void update(String[] brand,int[] count){
		//��������,������һ��,�޸�һ��
		//���ܼ�������
		Scanner sc = new Scanner(System.in);
		//��������
		for(int i = 0;i < brand.length ;i++){
			System.out.println("������"+brand[i]+"�Ŀ����");
			//��������,¼����,�洢������������
			int newCount = sc.nextInt();
			count[i] = newCount;
		}
        //int chooseNumber = sc.nextInt();
	}
	/*
	  ���巽��,չʾ���еĿ���嵥,����
	  ����ֵ,û��
	  ����,����
	*/
	public static void printStore(String[] brand,double[] size,double[] price,int[] count){
		System.out.println("----------�̳�����嵥----------");
		System.out.println("Ʒ���ͺ�     �ߴ�    �۸�    �����");
		//�������,�����ܿ����,���ܼ۸�
		int tootalCount = 0;
		int tootalMoney = 0;
		//��������,�����������е���Ʒ��Ϣ��ӡ����
		for(int i = 0;i < brand.length ;i++){
			System.out.println(brand[i]+"   "+size[i]+"    "+price[i]+"   "+count[i]);
			totalCount += count[i];
		    totalMoney += count[i]*price[i];
		}
		System.out.println("�ܿ����: "+totalCount);
		System.out.println("��Ʒ����ܽ��: "+totalMoney);
	}
	/*
	  ���巽��,ʵ���û���ѡ����,���ܵ���Ҫ������
	  ����ֵ,int
	  ����,û��
	*/
	public static int chooseFunction(){
		System.out.println("-------------������------------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ�������");
		System.out.println("3.�˳�");
		System.out.println("������Ҫִ�еĲ�����ţ�");
		//���ܼ�������
		Scanner sc = new Scanner(System.in);
        int chooseNumber = sc.nextInt();
        return	chooseNumber;	
	}
}*/
/*
   ʵ����Ʒ�Ŀ�����
     ����:
	    1. չʾ�û�ѡ�����嵥
		2. ����ѡ��Ĺ��ܱ��,���в�ͬ�Ĳ���
		   A. չʾ���п��
		   B. �޸Ŀ������
		   
	  ����:
	    1. չʾ�û��嵥:
		   ������, �û�����, ѡ�������
		2. ����ѡ��,���ò�ͬ�ķ���
		    switch���
			  case 1 2 3
		
		   A  չʾ���
		     ���洢��Ʒ������,����
		   B  �޸Ŀ��
		        
			  �޸����еĿ������
*/
import java.util.Scanner;
public class Shopp{
	public static void main(String[] args){
		//ʹ������,������Ʒ����Ϣ
		//Ʒ��,�ߴ�,�۸�,�����, ����5������
		String[] brand = {"MacBookAir","ThinkpadT450"};
		double[] size = {13.3,15.6};
		double[] price = {9998.97,6789.56};
		int[] count = {0,0};
		while(true){
		int choose = chooseFunction();
		switch(choose){
			case 1:
			  //���ò鿴����嵥����
			  printStore(brand,size,price,count);
			break;
			
			case 2:
			  //�����޸Ŀ��ķ���
			  update(brand,count);
			break;
			
			case 3:
			 return ;
			
			
			default:
			  System.out.println("û���������");
			break;
		}
		}
	}
	/*
	  ���巽��,�޸�������Ʒ�Ŀ��
	    �û�����1��,�޸�1��
		����ֵ,û��
		����, �����������, Ʒ������
	*/
	public static void update(String[] brand, int[] count){
		//��������,������һ��,�޸�һ��
		//���ܼ�������
		Scanner sc = new Scanner(System.in);
		//��������
		for(int i = 0; i < brand.length ; i++){
			System.out.println("������"+brand[i]+"�Ŀ����");
			//��������,¼����, �洢������������
			int newCount = sc.nextInt();
			count[i] = newCount;
		}
		//int chooseNumber = sc.nextInt();
	}
	
	/*
	   ���巽��,չʾ���еĿ���嵥,����
	   ����ֵ,û��
	   ����, ����
	*/
	public static void printStore(String[] brand,double[] size,double[] price,int[] count){
		System.out.println("----------�̳�����嵥----------");
		System.out.println("Ʒ���ͺ�     �ߴ�    �۸�    �����");
		//�������,�����ܿ����,���ܼ۸�
		int totalCount = 0;
		int totalMoney = 0;
		//��������,�����������е���Ʒ��Ϣ��ӡ����
		for(int i = 0 ; i < brand.length ; i++){
			System.out.println(brand[i]+"   "+size[i]+"    "+price[i]+"   "+count[i]);
			totalCount += count[i];
			totalMoney += count[i]*price[i];
		}
		System.out.println("�ܿ����: "+totalCount);
		System.out.println("��Ʒ����ܽ��: "+totalMoney);
	}
	
	/*
	  ���巽��,ʵ���û���ѡ����,���ܵ���Ҫ������
	  ����ֵ, int
	  ����, û��
	*/
	public static int chooseFunction(){
		System.out.println("-------------������------------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ�������");
		System.out.println("3.�˳�");
		System.out.println("������Ҫִ�еĲ�����ţ�");
		//���ܼ�������
		Scanner sc = new Scanner(System.in);
		int chooseNumber = sc.nextInt();
		return chooseNumber;
	}
}