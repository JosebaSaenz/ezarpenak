select bozkatuDu from Bozkaketa where bozkatuDu = %hautatutakoHerrialdea and urtea = YEAR(NOW)
select h.bandera, h.izena, o.artistaIzena, o.abestiarenIzena from Herrialdea h, Ordezkaritza o where h.izena=o.herrialdeIzena and o.urtea=YEAR(NOW)
INSERT into Bozkaketa set bozkatuDu = %hautatutakoHerrialdea, bozkatuaIzanDa = %bozkatutakoHerrialdea, puntuak = %emandakoPuntuak, urtea = YEAR(NOW)
update Ordezkaritza set puntuak = puntuak + %emandakoPuntuak where herrialdeIzena = %bozkatutakoHerrialdea urtea=YEAR(NOW)
select o.herrialdeIzena, o.puntuak, h.bandera from Ordezkaritza o, Herrialdea h where o.herrialdeIzena = h.izena and urtea = YEAR(NOW) order by puntuak desc limit 3izenArtistikoa