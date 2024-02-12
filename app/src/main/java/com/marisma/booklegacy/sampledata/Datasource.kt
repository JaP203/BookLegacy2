/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.marisma.booklegacy.sampledata

class Datasource {
    companion object {
        var favBookList = mutableListOf<Book>()

        public fun rellenaFAV(){
        favBookList.clear()
        bookList.forEach{
            if(it.fav){

                favBookList.add(it)
            }
        }
        }

        val bookList = mutableListOf<Book>(
            Book(
                "Palabras Radiantes",
                1450,
                "B.Sanderson",
                "d",
                false,
                "Words of Radiance es una novela de fantasía épica escrita por el autor estadounidense Brandon Sanderson, es el segundo libro de la serie El archivo de las tormentas.\u200B "
            ),
            Book(
                "El imperio final",
                650,
                "B.Sanderson",
                "nbif",
                false,
                "El imperio final es una novela de fantasía escrita por el autor estadounidense Brandon Sanderson. Su versión original fue publicada el 17 de julio de 2006 por Tor Books y la traducción en español fue publicada en España por la editorial Nova en 2008"
            ),
            Book(
                "Amanecer Rojo",
                544,
                "P.Brown",
                "amr",
                false,
                "Ideas como libertad o igualdad murieron junto con la Tierra. Ahora, en Marte, el equilibrio se sustenta en un férreo sistema de castas representadas por colores, en el que los dorados son la élite gobernante. Pero Darrow no es un dorado, es un rojo. Para sobrevivir debe ocultar su verdad sin olvidar que cada muerte, cada paso en la batalla, es por la libertad."
            ),
            Book(
                "Hijo Dorado",
                640,
                "P.Brown",
                "hd",
                false,
                "Tras una implacable competición en el Instituto de Marte, Darrow se ha anado un puesto de honor entre la élite gobernante. Ahora luce la cicatriz curvada de los dorados, los más crueles y brillantes de los humanos."
            ),
            Book(
                "Juego de tronos",
                800,
                "G R.R. Martin",
                "got",
                false,
                "En un mundo diferente al nuestro, en el que los veranos y los inviernos duran generaciones, un gran conflicto está a punto de estallar. Robert Baratheon ocupa el Trono de Hierro en el cálido y opulento sur de Poniente. Se lo arrebató tras una sangrienta guerra al último rey loco de la dinastía Targaryen, señores de dragones."
            ),
            Book(
                "Cómo hacer un coche",
                400,
                "A.Newey",
                "chuc",
                false,
                "En este emocionante libro descubriremos de manera exhaustiva, fascinante y extraordinariamente entretenida cómo funciona un coche de carreras, mientras recorremos la trayectoria de Adrian Newey, el más grande diseñador de automóviles de la historia, desde sus comienzos en la IndyCar hasta alcanzar un éxito inigualado en la Fórmula 1 diseñando coches para pilotos como Mario Andretti, Nigel Mansell, Alain Prost, Mika Häkkinen, Mark Webber o Sebastian Vettel entre otros, siempre con un objetivo inquebrantable: conseguir el coche más rápido."
            ),
            Book(
                "Reina roja",
                568,
                "J.Gómez-Jurado",
                "rj",
                false,
                "Antonia Scott es especial. Muy especial, No es policía ni criminalista. Nunca ha empuñado un arma ni llevado una placa, y, sin embargo, ha resuelto decenas de crímenes."
            ),
            Book(
                "TWT El ojo del mundo",
                834,
                "R.Jordan",
                "lrdt",
                false,
                "La vida de Rand Al’Thor y sus amigos en Campo de Emond ha resultado bastante monótona hasta que una joven misteriosa llega al pueblo. Moraine, una maga capaz de encauzar el Poder Único, anuncia el despertar de una terrible amenaza."
            ),
            Book(
                "EL NOMBRE DEL VIENTO ",
                880,
                "PATRICK ROTHFUSS",
                "endv",
                false,
                "En una posada en tierra de nadie, un hombre se dispone a relatar, por primera vez, la auténtica historia de su vida. Una historia que únicamente él conoce y que ha quedado diluida tras los rumores, las conjeturas y los cuentos de taberna que le han convertido en un personaje legendario a quien todos daban ya por muerto: Kvothe... músico, mendigo, ladrón, estudiante, mago, héroe y asesino."
            ),
            Book(
                "Elantris",
                800,
                "B.Sanderson",
                "elant",
                false,
                "En una posada en tierra de nadie, un hombre se dispone a relatar, por primera vez, la auténtica historia de su vida. Una historia que únicamente él conoce y que ha quedado diluida tras los rumores, las conjeturas y los cuentos de taberna que le han convertido en un personaje legendario a quien todos daban ya por muerto: Kvothe... músico, mendigo, ladrón, estudiante, mago, héroe y asesino."
            ),
            Book(
                "La historia interminable",
                544,
                "M.Ende",
                "lhit",
                false,
                "La Emperatriz Infantil está mortalmente enferma y su reino corre un grave peligro. La salvación depende de Atreyu, un valiente guerrero de la tribu de los pieles verdes, y Bastián, un niño tímido que lee con pasión un libro mágico. "
            ),

            )
    }
    }
