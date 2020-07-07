package mapper;


import entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Insert("insert into tb_user(name) values (#{name}) ")
    public void save(String name);
}
