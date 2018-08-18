package io.choerodon.demo.api.controller.v1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author chuanhao.zhao@hand-china.com
 * @version 1.0
 * @name MyTask
 * @description MyTask
 * @date 2018/8/18
 */

@Component
@ConfigurationProperties(prefix = "mytask")
public class MyTask {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + "，" + name;
    }
}
