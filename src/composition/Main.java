package composition;

public class Main {

	public static void main(String args[]) {
		try {
			System.out.println("创建根目录");
			//先创建好目录
			Directory rootdir = new Directory("root");
			Directory bindir = new Directory("bin");
			Directory temdir = new Directory("tem");
			Directory usrdir = new Directory("usr");
			Directory vardir = new Directory("var");
			//在目录下添加子目录
			rootdir.add(bindir);
			rootdir.add(temdir);
			rootdir.add(usrdir);
			bindir.add(vardir);
			//在目录下添加文件
			bindir.add(new File("vi",1000));
			vardir.add(new File("hadoop",2000));
			//打印目录结构
			rootdir.printList();
			
			
			System.out.println("");
			System.out.println("在usr目录下添加子目录和文件");
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
