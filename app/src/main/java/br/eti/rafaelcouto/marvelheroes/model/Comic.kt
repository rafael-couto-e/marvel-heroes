package br.eti.rafaelcouto.marvelheroes.model

import br.eti.rafaelcouto.marvelheroes.model.general.Thumbnail

data class Comic(
    var id: Long,
    var title: String,
    var thumbnail: Thumbnail
)
