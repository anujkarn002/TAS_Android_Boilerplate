package com.theappsolutions.boilerplate.other.functions;

/**
 * @author Severyn Parkhomenko s.parkhomenko@theappsolutions.com
 * @copyright (c) 2018 TheAppSolutions. (https://theappsolutions.com)
 */
public interface Function3<T1, T2, T3, R> {
    R call(T1 param1, T2 param2, T3 param3);
}