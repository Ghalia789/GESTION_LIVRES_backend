package com.nadhem.livres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadhem.livres.entities.Genre;
import com.nadhem.livres.entities.Livre;
import com.nadhem.livres.repos.LivreRepository;

import java.util.List;

@Service
public class LivreServiceImpl implements LivreService {

    @Autowired
    LivreRepository livreRepository;

    @Override
    public Livre saveLivre(Livre livre) {
        return livreRepository.save(livre);
    }

    @Override
    public Livre updateLivre(Livre livre) {
        return livreRepository.save(livre);
    }

    @Override
    public void deleteLivre(Livre livre) {
        livreRepository.delete(livre);
    }

    @Override
    public void deleteLivreById(Long id) {
        livreRepository.deleteById(id);
    }

    @Override
    public Livre getLivre(Long id) {
        return livreRepository.findById(id).get();
    }

    @Override
    public List<Livre> getAllLivres() {
        return livreRepository.findAll();
    }

    @Override
    public List<Livre> getLivresByGenre(Genre genre) {
        return livreRepository.findByGenre(genre);
    }

    @Override
    public List<Livre> findByGenreIdGen(Long idGen) {
        return livreRepository.findByGenreIdGen(idGen);
    }

    @Override
    public List<Livre> findByTitreLivreContains(String titreLivre) {
        return livreRepository.findByTitreLivreContains(titreLivre);
    }
}
