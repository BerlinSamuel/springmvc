package com.chainsys.variables;
/**
 * 
 * @author Chainsys Venkat
 * created on 25 march 2022
 */
public class Calculator {
	/**
	 * Add method: will take 2 integer values using the following parameters,
	 * and will ad the values. The result of totaling will be returned back to the caller
	 * This a static method, object reference is not required.
	 * 
	 *  @param param1 of type int
	 *  @param param2 of type int
	 *  @return type int
	 */
public static int add(int param1, int param2)
{
	int result=param1+param2;
	return result;
	
}
/**
 * multiply method: will take 2 integer values using the following parameters,
 * and will ad the values. The result of totaling will be returned back to the caller
 * This a static method, object reference is not required.
 * 
 *  @param param1 of type int
 *  @param param2 of type int
 *  @return type int
 */
public static int multiply(int param1, int param2)
{
int result=param1*param2;
return result;
}
/**
 * divide method: will take 2 integer values using the following parameters,
 * and will ad the values. The result of totaling will be returned back to the caller
 * This a static method, object reference is not required.
 * 
 *  @param param1 of type int
 *  @param param2 of type int
 *  @return type int
 */
public static int divide(int param1, int param2)
{
int result=param1/param2;
return result;
}
/**
 * subtract method: will take 2 integer values using the following parameters,
 * and will ad the values. The result of totaling will be returned back to the caller
 * This a static method, object reference is not required.
 * 
 *  @param param1 of type int
 *  @param param2 of type int
 *  @return type int
 */
public static int subtract(int param1, int param2)
{
int result=param1-param2;
return result;
}
}
