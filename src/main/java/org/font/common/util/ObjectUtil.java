package org.font.common.util;

import lombok.SneakyThrows;
import org.apache.commons.beanutils.BeanUtils;

/**
 * 工具类的规范例子
 * 
 * 
 * @author llsmp
 * 
 */
public class ObjectUtil {

	@SneakyThrows
	public void copyAttribute(Object source, Object dest) {
		// org.springframework.beans.BeanUtils.copyProperties(source, dest);
		org.apache.commons.beanutils.BeanUtils.copyProperties(dest, source);
	}
}
