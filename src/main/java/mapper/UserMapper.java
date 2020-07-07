package mapper;


import org.apache.ibatis.annotations.Insert;

public interface UserMapper {

    @Insert("insert into tb_user(name) values (#{name}) ")
    public void save(String name);
}
