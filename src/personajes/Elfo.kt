package personajes

import armas.Carcaj

class Elfo(nombre:String,var carcaj: Carcaj) : Personaje(nombre, Estado.vivo){
    override fun toString(): String {
        return super.toString()+"Este Personaje es un Elfo, y en el carcaj tiene ${carcaj.flechas} flechas.\n"
    }
    fun lanzaFlechas(){
        carcaj.flechas--

    }
    fun recogeFlecas(flechas:Int){
        carcaj.flechas=flechas

    }
}
