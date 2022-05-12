package com.chainsys.unittest;

import com.chainsys.abstraction.AbsDemoB;
import com.chainsys.abstraction.DemoBChild;
public class TestDemoB {
	public static void testDemoB() {
		// abstract class can not be instantiated
//		AbsDemoB objectDemob=new AbsDemoB();
		AbsDemoB objectDemob=new DemoBChild();
		objectDemob.echo();
	}

}
