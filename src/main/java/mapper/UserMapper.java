package mapper;


import bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    @Insert("insert into tb_user(name) values (#{name}) ")
    public void save(String name);


    public User select(@Param("id")Integer uid);
    public User selectone(@Param("id")Integer uid);
}
