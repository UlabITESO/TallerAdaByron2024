package mx.ulab.retoadabyron.agua

import com.google.gson.annotations.SerializedName

data class AguaData(
    @SerializedName("InformeCalidadAgua") val InformeCalidadAgua:
    InformeCalidadAgua
)
data class Parametro(
    @SerializedName("Valor") val Valor: String,
    @SerializedName("Unidad") val Unidad: String? = null,
    @SerializedName("Descripcion") val Descripcion: String
)
data class MetalesPesados(
    @SerializedName("Plomo") val Plomo: String,
    @SerializedName("Mercurio") val Mercurio: String,
    @SerializedName("Cadmio") val Cadmio: String,
    @SerializedName("Descripcion") val Descripcion: String
)
data class Parametros(
    @SerializedName("TemperaturaAgua") val TemperaturaAgua: Parametro,
    @SerializedName("pH") val pH: Parametro,
    @SerializedName("Turbidez") val Turbidez: Parametro,
    @SerializedName("OxigenoDisuelto") val OxigenoDisuelto: Parametro,
    @SerializedName("Nitratos") val Nitratos: Parametro,
    @SerializedName("Fosfatos") val Fosfatos: Parametro,
    @SerializedName("ColiformesFecales") val ColiformesFecales: Parametro,
    @SerializedName("ConductividadElectrica") val ConductividadElectrica:
    Parametro,
    @SerializedName("MetalesPesados") val MetalesPesados: MetalesPesados
)
data class InformeCalidadAgua(
    @SerializedName("Ubicacion") val Ubicacion: String,
    @SerializedName("Fecha") val Fecha: String,
    @SerializedName("Parametros") val Parametros: Parametros
)