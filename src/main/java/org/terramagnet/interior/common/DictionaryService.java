/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.terramagnet.interior.common;

import java.util.Collection;
import java.util.Map;

/**
 * 业务字典服务.
 * @author lee
 */
public interface DictionaryService {
    /**
     * 获取全部业务字典.
     */
    public Collection<Dictionary> getDictionarys();
}
