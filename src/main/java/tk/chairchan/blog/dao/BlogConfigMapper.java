package tk.chairchan.blog.dao;

import org.springframework.stereotype.Component;
import tk.chairchan.blog.entity.BlogConfig;

import java.util.List;

@Component
public interface BlogConfigMapper {
    List<BlogConfig> selectAll();

    BlogConfig selectByPrimaryKey(String configName);

    int updateByPrimaryKeySelective(BlogConfig record);

}