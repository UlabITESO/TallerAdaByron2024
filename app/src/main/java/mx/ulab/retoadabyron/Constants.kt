package mx.ulab.retoadabyron

object Constants {
    val transporteJson = "[\n" +
            "        {\n" +
            "            \"nombre_ruta\": \"Tren ligero linea 1\",\n" +
            "            \"tipo_transporte\": \"Metro\",\n" +
            "            \"costo\": \"\$9.50\",\n" +
            "            \"frecuencia\": \"Salidas cada 15 min\",\n" +
            "            \"status\": \"En tiempo\",\n" +
            "            \"paradas\": [\n" +
            "                \"Periferico Norte\",\n" +
            "                \"Atemajac\",\n" +
            "                \"Division del norte\",\n" +
            "                \"Juarez\",\n" +
            "                \"España\",\n" +
            "                \"Periferico Sur\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"nombre_ruta\": \"Peribus\",\n" +
            "            \"tipo_transporte\": \"Articulado\",\n" +
            "            \"costo\": \"\$9.50\",\n" +
            "            \"frecuencia\": \"Salidas cada 5 min\",\n" +
            "            \"status\": \"Restrasado\",\n" +
            "            \"paradas\": [\n" +
            "                \"ITESO\",\n" +
            "                \"Lopez Mateos\",\n" +
            "                \"Parque Metropolitano\",\n" +
            "                \"CUCEA\",\n" +
            "                \"Periferico Norte\",\n" +
            "                \"Barranca de Huentitan\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"nombre_ruta\": \"380\",\n" +
            "            \"tipo_transporte\": \"Autobus\",\n" +
            "            \"costo\": \"\$5.00\",\n" +
            "            \"frecuencia\": \"Salidas cada 10 min\",\n" +
            "            \"status\": \"Retrasado\",\n" +
            "            \"paradas\": [\n" +
            "                \"ITESO\",\n" +
            "                \"Las fuentes\",\n" +
            "                \"Plaza del Sol\",\n" +
            "                \"RIU\",\n" +
            "                \"Minerva\"\n" +
            "            ]\n" +
            "        }\n" +
            "    ]"

    val aireJson = "[\n" +
            "  {\n" +
            "  \"location\": {\n" +
            "        \"name\": \"Guadalajara\",\n" +
            "        \"region\": \"Jalisco\",\n" +
            "        \"country\": \"Mexico\",\n" +
            "        \"lat\": 20.67,\n" +
            "        \"lon\": -103.39\n" +
            "    },\n" +
            "    \"current\": {\n" +
            "      \"temp_c\": 22.0,\n" +
            "      \"feelslike_c\": 24.6,\n" +
            "      \"wind_kph\": 6.8,\n" +
            "      \"humidity\": 38,\n" +
            "      \"condition\": {\n" +
            "        \"text\": \"Nublado\"\n" +
            "      },\n" +
            "      \"uv\": 4.0,\n" +
            "      \"air_quality\": 89\n" +
            "    }\n" +
            "  },\n" +
            "  {\n" +
            "  \"location\": {\n" +
            "        \"name\": \"Zapopan\",\n" +
            "        \"region\": \"Jalisco\",\n" +
            "        \"country\": \"Mexico\",\n" +
            "        \"lat\": 20.710524341171393,\n" +
            "        \"lon\": -103.41199335303163\n" +
            "    },\n" +
            "    \"current\": {\n" +
            "      \"temp_c\": 24.0,\n" +
            "      \"feelslike_c\": 24.6,\n" +
            "      \"wind_kph\": 6.8,\n" +
            "      \"humidity\": 45,\n" +
            "      \"condition\": {\n" +
            "        \"text\": \"Soleado\"\n" +
            "      },\n" +
            "      \"uv\": 7.0,\n" +
            "      \"air_quality\": 103\n" +
            "    }\n" +
            "  },\n" +
            "  {\n" +
            "  \"location\": {\n" +
            "        \"name\": \"Tlaquepaque\",\n" +
            "        \"region\": \"Jalisco\",\n" +
            "        \"country\": \"Mexico\",\n" +
            "        \"lat\": 20.608963402629687,\n" +
            "        \"lon\": -103.41477027715523\n" +
            "    },\n" +
            "    \"current\": {\n" +
            "      \"temp_c\": 19.0,\n" +
            "      \"feelslike_c\": 18.0,\n" +
            "      \"wind_kph\": 15.8,\n" +
            "      \"humidity\": 20,\n" +
            "      \"condition\": {\n" +
            "        \"text\": \"Lloviendo\"\n" +
            "      },\n" +
            "      \"uv\": 1.0,\n" +
            "      \"air_quality\": 48\n" +
            "    }\n" +
            "  },\n" +
            "  {\n" +
            "  \"location\": {\n" +
            "        \"name\": \"Puerto Vallarta\",\n" +
            "        \"region\": \"Jalisco\",\n" +
            "        \"country\": \"Mexico\",\n" +
            "        \"lat\": 20.66413512036428,\n" +
            "        \"lon\": -105.25379140578352\n" +
            "    },\n" +
            "    \"current\": {\n" +
            "      \"temp_c\": 35.0,\n" +
            "      \"feelslike_c\": 42.7,\n" +
            "      \"wind_kph\": 3.4,\n" +
            "      \"humidity\": 48,\n" +
            "      \"condition\": {\n" +
            "        \"text\": \"Soleado\"\n" +
            "      },\n" +
            "      \"uv\": 9.0,\n" +
            "      \"air_quality\": 20\n" +
            "    }\n" +
            "  }\n" +
            "]\n"

    val aguaJson = "[\n" + "{\n" +
            "  \"InformeCalidadAgua\": {\n" +
            "    \"Ubicacion\": \"Lago de Chapala\",\n" +
            "    \"Fecha\": \"2023-11-29\",\n" +
            "    \"Parametros\": {\n" +
            "      \"TemperaturaAgua\": {\n" +
            "        \"Valor\": 29,\n" +
            "        \"Unidad\": \"°C\",\n" +
            "        \"Descripcion\": \"Afecta aspectos biológicos y químicos del ecosistema acuático\"\n" +
            "      },\n" +
            "      \"pH\": {\n" +
            "        \"Valor\": \"2.3\",\n" +
            "        \"Descripcion\": \"Moderadamente ácido\"\n" +
            "      },\n" +
            "      \"Turbidez\": {\n" +
            "        \"Valor\": 5,\n" +
            "        \"Unidad\": \"NTU\",\n" +
            "        \"Descripcion\": \"Indica claridad del agua\"\n" +
            "      },\n" +
            "      \"OxigenoDisuelto\": {\n" +
            "        \"Valor\": 9,\n" +
            "        \"Unidad\": \"mg/L\",\n" +
            "        \"Descripcion\": \"Esencial para la vida acuática\"\n" +
            "      },\n" +
            "      \"Nitratos\": {\n" +
            "        \"Valor\": 3,\n" +
            "        \"Unidad\": \"mg/L\",\n" +
            "        \"Descripcion\": \"Puede indicar contaminación por fertilizantes\"\n" +
            "      },\n" +
            "      \"Fosfatos\": {\n" +
            "        \"Valor\": \"0.1\",\n" +
            "        \"Unidad\": \"mg/L\",\n" +
            "        \"Descripcion\": \"Altas concentraciones pueden llevar a eutrofización\"\n" +
            "      },\n" +
            "      \"ColiformesFecales\": {\n" +
            "        \"Valor\": 10,\n" +
            "        \"Unidad\": \"CFU/100 mL\",\n" +
            "        \"Descripcion\": \"Indica contaminación fecal\"\n" +
            "      },\n" +
            "      \"ConductividadElectrica\": {\n" +
            "        \"Valor\": \"65\",\n" +
            "        \"Unidad\": \"µS/cm\",\n" +
            "        \"Descripcion\": \"Mide cantidad de sales disueltas\"\n" +
            "      },\n" +
            "      \"MetalesPesados\": {\n" +
            "        \"Plomo\": \"Por debajo de límites detectables\",\n" +
            "        \"Mercurio\": \"Por debajo de límites detectables\",\n" +
            "        \"Cadmio\": \"Por debajo de límites detectables\",\n" +
            "        \"Descripcion\": \"Bajos niveles son cruciales para la salud\"\n" +
            "      }\n" +
            "    }\n" +
            "  }\n" +
            "},\n" +
            "{\n" +
            "  \"InformeCalidadAgua\": {\n" +
            "    \"Ubicacion\": \"Río Santiago\",\n" +
            "    \"Fecha\": \"2023-11-29\",\n" +
            "    \"Parametros\": {\n" +
            "      \"TemperaturaAgua\": {\n" +
            "        \"Valor\": 18,\n" +
            "        \"Unidad\": \"°C\",\n" +
            "        \"Descripcion\": \"Afecta aspectos biológicos y químicos del ecosistema acuático\"\n" +
            "      },\n" +
            "      \"pH\": {\n" +
            "        \"Valor\": \"7.2\",\n" +
            "        \"Descripcion\": \"Neutro\"\n" +
            "      },\n" +
            "      \"Turbidez\": {\n" +
            "        \"Valor\": 2,\n" +
            "        \"Unidad\": \"NTU\",\n" +
            "        \"Descripcion\": \"Indica claridad del agua\"\n" +
            "      },\n" +
            "      \"OxigenoDisuelto\": {\n" +
            "        \"Valor\": 6,\n" +
            "        \"Unidad\": \"mg/L\",\n" +
            "        \"Descripcion\": \"Esencial para la vida acuática\"\n" +
            "      },\n" +
            "      \"Nitratos\": {\n" +
            "        \"Valor\": 3,\n" +
            "        \"Unidad\": \"mg/L\",\n" +
            "        \"Descripcion\": \"Puede indicar contaminación por fertilizantes\"\n" +
            "      },\n" +
            "      \"Fosfatos\": {\n" +
            "        \"Valor\": \"0.1\",\n" +
            "        \"Unidad\": \"mg/L\",\n" +
            "        \"Descripcion\": \"Altas concentraciones pueden llevar a eutrofización\"\n" +
            "      },\n" +
            "      \"ColiformesFecales\": {\n" +
            "        \"Valor\": 10,\n" +
            "        \"Unidad\": \"CFU/100 mL\",\n" +
            "        \"Descripcion\": \"Indica contaminación fecal\"\n" +
            "      },\n" +
            "      \"ConductividadElectrica\": {\n" +
            "        \"Valor\": \"298\",\n" +
            "        \"Unidad\": \"µS/cm\",\n" +
            "        \"Descripcion\": \"Mide cantidad de sales disueltas\"\n" +
            "      },\n" +
            "      \"MetalesPesados\": {\n" +
            "        \"Plomo\": \"Por debajo de límites detectables\",\n" +
            "        \"Mercurio\": \"Por debajo de límites detectables\",\n" +
            "        \"Cadmio\": \"Por debajo de límites detectables\",\n" +
            "        \"Descripcion\": \"Bajos niveles son cruciales para la salud\"\n" +
            "      }\n" +
            "    }\n" +
            "  }\n" +
            "},\n" +
            "{\n" +
            "  \"InformeCalidadAgua\": {\n" +
            "    \"Ubicacion\": \"Río Lerma\",\n" +
            "    \"Fecha\": \"2023-11-29\",\n" +
            "    \"Parametros\": {\n" +
            "      \"TemperaturaAgua\": {\n" +
            "        \"Valor\": 15,\n" +
            "        \"Unidad\": \"°C\",\n" +
            "        \"Descripcion\": \"Afecta aspectos biológicos y químicos del ecosistema acuático\"\n" +
            "      },\n" +
            "      \"pH\": {\n" +
            "        \"Valor\": \"10.2\",\n" +
            "        \"Descripcion\": \"Moderadamente alcalino\"\n" +
            "      },\n" +
            "      \"Turbidez\": {\n" +
            "        \"Valor\": 7,\n" +
            "        \"Unidad\": \"NTU\",\n" +
            "        \"Descripcion\": \"Indica claridad del agua\"\n" +
            "      },\n" +
            "      \"OxigenoDisuelto\": {\n" +
            "        \"Valor\": 13,\n" +
            "        \"Unidad\": \"mg/L\",\n" +
            "        \"Descripcion\": \"Esencial para la vida acuática\"\n" +
            "      },\n" +
            "      \"Nitratos\": {\n" +
            "        \"Valor\": 3,\n" +
            "        \"Unidad\": \"mg/L\",\n" +
            "        \"Descripcion\": \"Puede indicar contaminación por fertilizantes\"\n" +
            "      },\n" +
            "      \"Fosfatos\": {\n" +
            "        \"Valor\": \"0.1\",\n" +
            "        \"Unidad\": \"mg/L\",\n" +
            "        \"Descripcion\": \"Altas concentraciones pueden llevar a eutrofización\"\n" +
            "      },\n" +
            "      \"ColiformesFecales\": {\n" +
            "        \"Valor\": 10,\n" +
            "        \"Unidad\": \"CFU/100 mL\",\n" +
            "        \"Descripcion\": \"Indica contaminación fecal\"\n" +
            "      },\n" +
            "      \"ConductividadElectrica\": {\n" +
            "        \"Valor\": \"400\",\n" +
            "        \"Unidad\": \"µS/cm\",\n" +
            "        \"Descripcion\": \"Mide cantidad de sales disueltas\"\n" +
            "      },\n" +
            "      \"MetalesPesados\": {\n" +
            "        \"Plomo\": \"Por debajo de límites detectables\",\n" +
            "        \"Mercurio\": \"Por debajo de límites detectables\",\n" +
            "        \"Cadmio\": \"Por debajo de límites detectables\",\n" +
            "        \"Descripcion\": \"Bajos niveles son cruciales para la salud\"\n" +
            "      }\n" +
            "    }\n" +
            "  }\n" +
            "}\n" +
            "]\n"

}