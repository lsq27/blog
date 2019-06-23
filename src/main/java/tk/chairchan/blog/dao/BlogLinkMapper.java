package tk.chairchan.blog.dao;

import org.springframework.stereotype.Component;
import tk.chairchan.blog.entity.BlogLink;
import tk.chairchan.blog.util.PageQueryUtil;

import java.util.List;

@Component
public interface BlogLinkMapper {
    int deleteByPrimaryKey(Integer linkId);

    int insert(BlogLink record);

    int insertSelective(BlogLink record);

    BlogLink selectByPrimaryKey(Integer linkId);

    int updateByPrimaryKeySelective(BlogLink record);

    int updateByPrimaryKey(BlogLink record);

    List<BlogLink> findLinkList(PageQueryUtil pageUtil);

    int getTotalLinks(PageQueryUtil pageUtil);

    int deleteBatch(Integer[] ids);
}