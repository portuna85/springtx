package hello.springtx.propagation;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Log {

    @Id @GeneratedValue
    public Long id;

    private String message;

    public Log() {
    }

    public Log(String message) {
        this.message = message;
    }
}
