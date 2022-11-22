package Treta;

public class MainClass {

	public static void main(String[] args) {
		Servers s = new Servers();
		s.setProcessors("Single-core CPU");
		s.setNicIP("neznam so e ova i ne e bitno");
		s.setHddSize("3.5");

		System.out.println(s.getProcessors() + " - " + s.getNicIp() + " - " + s.getHddSize());

	}

}