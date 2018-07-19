package cloud.module.course.instructor;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Instructor")
@Data
public class Instructor {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator( name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String instructorId;

    private String userId;

    private String code;

    private String realName;

    private String faculty;

    private String office;

    private Integer totalRatingNum;


}
