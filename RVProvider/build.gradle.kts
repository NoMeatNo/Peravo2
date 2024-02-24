version = 2


cloudstream {
    language = "en"
    // All of these properties are optional, you can safely remove them

    description = "Persian World"
    authors = listOf("KillerDogeEmpire")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "AsianDrama",
        "TvSeries",
        "Anime",
        "Movie",
        "Live",
    )

    iconUrl = "https://raw.githubusercontent.com/NoMeatNo/Peravo2/master/logos/peravo2.png"
}
