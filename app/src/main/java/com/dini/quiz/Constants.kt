package com.dini.quiz

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "¿De que pais es esta bandera?", R.drawable.ic_flag_of_argentina, "Argentina", "Australia", "Armenia", "Austria", 1
        )
        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "¿De que pais es esta bandera?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "¿De que pais es esta bandera?",
            R.drawable.ic_flag_of_brazil,
            "Bielorrusia", "Belize",
            "Brunei", "Brasil", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "¿De que pais es esta bandera?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgica",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "¿De que pais es esta bandera?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "Francia",
            "Fiji", "Finlandia", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "¿De que pais es esta bandera?",
            R.drawable.ic_flag_of_germany,
            "Alemania", "Georgia",
            "Grecia", "Ninguno", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "¿De que pais es esta bandera?",
            R.drawable.ic_flag_of_denmark,
            "R. Dominica", "Egipto",
            "Dinamarca", "Ethiopia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "¿De que pais es esta bandera?",
            R.drawable.ic_flag_of_india,
            "Irlanda", "Iran",
            "Hungria", "India", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "¿De que pais es esta bandera?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "Nueva Zelanda",
            "Tuvalu", "Estados Unidos", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "¿De que pais es esta bandera?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordania",
            "Sudan", "Palestina", 1
        )

        questionsList.add(que10)

        return questionsList
    }

}