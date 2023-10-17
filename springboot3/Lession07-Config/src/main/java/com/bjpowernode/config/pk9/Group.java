package com.bjpowernode.config.pk9;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


// 創建此容器
@Configuration
// 配置此 bean 的屬性
@ConfigurationProperties(prefix = "group")
// 指定文件的來源
@PropertySource(value = "classpath:/group-info.properties", encoding = "UTF-8")
public class Group {

    private String name;
    private String leader;
    private Integer members;

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", leader='" + leader + '\'' +
                ", members=" + members +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }
}
