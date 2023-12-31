package com.SenacQuartaFase.AvaliaRestaurante.repositories;

import com.SenacQuartaFase.AvaliaRestaurante.entities.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    @Query(value = "SELECT * FROm avaliacao where restaurante_id = ? ", nativeQuery = true)
    List<Avaliacao> buscarRestaurantePeloIdusuario(Long restaurante_id);

    boolean existsByRestauranteIdAndPessoaId(Long restauranteId, Long usuarioId);
}
