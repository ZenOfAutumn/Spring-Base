
/**
 * 
 * 切面织入顺序
 * 1.同一切面内按照声明顺序织入
 * 2.不同切面且实现Ordered接口的切面,按照由小到大的顺序
 * 3.不同切面且为实现Ordered接口的切面,无特定顺序
 *
 *
 * 
 */

package com.autumn.zen.aop.annotation.order;

