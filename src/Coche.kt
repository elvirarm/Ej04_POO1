class Coche(color: String, marcaInicial: String?, val modelo: String?, val caballos: Int, val puertas: Int, val matricula: String){

    val marca: String? = marcaInicial
        get() = field?.lowercase()?.replaceFirstChar{ it.uppercase()}




    init{
        require(!marcaInicial.isNullOrEmpty()){"La marca no puede estar vacía o ser nula."}
        require(!modelo.isNullOrEmpty()){"El modelo no puede estar vacío o ser nulo."}
        require (matricula.length == 7){"La matrícula no puede ser superior a 7 dígitos."}
        require (caballos in 70..700){"El número de caballos tiene que estar en el rango 70-700."}
        require (puertas in 3..5){"El coche debe tener entre 3 y 5 puertas."}
    }

    var colorInicial: String? = color
        set (value){
            require(value.isNullOrEmpty()){"El color no puede estar vacío"}
            field = value
        }




    override fun toString(): String {
        return "Coche = color $colorInicial, marca: $marca, modelo: $modelo, caballos: $caballos, puertas: $puertas, matrícula: $matricula"
    }
}