package composition;

public class Main {

	public static void main(String args[]) {
		try {
			System.out.println("������Ŀ¼");
			//�ȴ�����Ŀ¼
			Directory rootdir = new Directory("root");
			Directory bindir = new Directory("bin");
			Directory temdir = new Directory("tem");
			Directory usrdir = new Directory("usr");
			Directory vardir = new Directory("var");
			//��Ŀ¼�������Ŀ¼
			rootdir.add(bindir);
			rootdir.add(temdir);
			rootdir.add(usrdir);
			bindir.add(vardir);
			//��Ŀ¼������ļ�
			bindir.add(new File("vi",1000));
			vardir.add(new File("hadoop",2000));
			//��ӡĿ¼�ṹ
			rootdir.printList();
			
			
			System.out.println("");
			System.out.println("��usrĿ¼�������Ŀ¼���ļ�");
			Directory admistratordir = new Directory("admistrator");
			Directory kdwdir = new Directory("kdw");
			usrdir.add(admistratordir);
			usrdir.add(kdwdir);
			admistratordir.add(new File("document",100));
			admistratordir.add(new File("wechat",0));
			kdwdir.add(new File("mypicture",0));
			kdwdir.add(new File("qq",100));
			rootdir.printList();
			
		}catch(FileTreatmentException e) {
			e.printStackTrace();
		}
	}
}
