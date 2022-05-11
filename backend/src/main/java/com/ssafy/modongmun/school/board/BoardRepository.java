package com.ssafy.modongmun.school.board;

import com.ssafy.modongmun.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findByUser(User user);

}
