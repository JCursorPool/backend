package org.dromara.system.domain.vo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import lombok.Data;

/**
 * 缓存监控列表信息
 *
 * @author Michelle.Chung
 */
@Data
public class CacheListInfoVo {

    private Properties info;

    private Long dbSize;

    private List<Map<String, String>> commandStats;

}
