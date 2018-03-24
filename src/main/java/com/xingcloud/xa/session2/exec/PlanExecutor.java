package com.xingcloud.xa.session2.exec;

import com.xingcloud.xa.session2.ra.Operation;
import com.xingcloud.xa.session2.ra.Relation;
import com.xingcloud.xa.session2.ra.RelationProvider;
import com.xingcloud.xa.session2.ra.impl.XTableScan;

/**
 * Author: mulisen
 * Date:   2/6/13
 */
public class PlanExecutor {

	public static RelationProvider executePlan(Operation root){
		XTableScan xTableScan = new XTableScan("user");
		Relation relation = xTableScan.evaluate();
		Relation ff = root.evaluate();


		System.out.println("root = " + root + ff);
		//TODO 执行root为根节点的Plan，返回执行结果
		return null;
	}
}
