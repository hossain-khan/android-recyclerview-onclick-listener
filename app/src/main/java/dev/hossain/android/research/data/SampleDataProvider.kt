package dev.hossain.android.research.data

import dev.hossain.android.research.data.model.Person

/**
 * Sample data provider that is used as sample data in RecyclerViews views.
 */
object SampleDataProvider {

    /**
     * Provides list of persons with option to [limit] number of persons returned.
     */
    fun people(limit: Int = 50): List<Person> {
        return people.take(limit)
    }

    /**
     * Sample person data generated from <a href="https://generatedata.com/">generatedata.com</a>
     */
    private val people = listOf(
        Person(id = 1, name = "Beau Flynn", phone = "(166) 535-9612", company = "Erat Volutpat Corp."),
        Person(id = 2, name = "Zephania Atkinson", phone = "(600) 187-4549", company = "Orci Ut Sagittis LLC"),
        Person(id = 3, name = "Damon Cannon", phone = "(145) 643-1468", company = "Sollicitudin Foundation"),
        Person(id = 4, name = "Yardley Cummings", phone = "(327) 569-4527", company = "Euismod Enim Corp."),
        Person(id = 5, name = "Roth Robles", phone = "(739) 496-1410", company = "Id Consulting"),
        Person(id = 6, name = "Perry Massey", phone = "(689) 875-7750", company = "Sed Leo Cras Inc."),
        Person(id = 7, name = "Allen Bates", phone = "(489) 893-4786", company = "Mauris Integer Sem LLC"),
        Person(id = 8, name = "Alvin Baldwin", phone = "(510) 613-8535", company = "Vitae Ltd"),
        Person(id = 9, name = "Brenden Callahan", phone = "(401) 153-1648", company = "Nec Corporation"),
        Person(id = 10, name = "Vladimir Martin", phone = "(834) 623-2797", company = "Lacinia At Iaculis LLC"),
        Person(id = 11, name = "Dalton Blankenship", phone = "(195) 985-6522", company = "Enim Diam Incorporated"),
        Person(id = 12, name = "Conan Hatfield", phone = "(905) 722-1001", company = "Fringilla Foundation"),
        Person(id = 13, name = "Solomon Madden", phone = "(817) 655-9883", company = "Aliquam Mauris Industries"),
        Person(id = 14, name = "Gabriel Olsen", phone = "(304) 500-8799", company = "Enim Mauris Associates"),
        Person(id = 15, name = "Hayden Lyons", phone = "(515) 523-7322", company = "Cras Dictum Ultricies LLP"),
        Person(id = 16, name = "Evan Silva", phone = "(247) 615-8815", company = "Mauris LLP"),
        Person(id = 17, name = "Salvador Carlson", phone = "(320) 727-6536", company = "Sed Inc."),
        Person(id = 18, name = "Graiden Gallegos", phone = "(678) 700-0928", company = "Mauris Aliquam Eu PC"),
        Person(id = 19, name = "Kirk Valentine", phone = "(810) 551-5468", company = "Sed Sem Corporation"),
        Person(id = 20, name = "Rashad Duffy", phone = "(290) 219-1272", company = "Vel Limited"),
        Person(id = 21, name = "Xanthus Weber", phone = "(659) 751-0577", company = "A LLP"),
        Person(id = 22, name = "Jarrod Garza", phone = "(518) 837-9307", company = "Sodales Nisi Corporation"),
        Person(id = 23, name = "Barrett Dale", phone = "(139) 116-7872", company = "Varius Inc."),
        Person(id = 24, name = "Thaddeus Macdonald", phone = "(481) 499-5511", company = "Elit A Corporation"),
        Person(id = 25, name = "Basil Hughes", phone = "(263) 498-9729", company = "Morbi Ltd"),
        Person(id = 26, name = "James Pope", phone = "(400) 189-7765", company = "Nulla Industries"),
        Person(id = 27, name = "Lucius Salas", phone = "(175) 796-9335", company = "Vivamus Molestie LLC"),
        Person(id = 28, name = "Blake Salazar", phone = "(573) 629-5007", company = "Ut Limited"),
        Person(id = 29, name = "Louis Medina", phone = "(604) 153-5876", company = "Posuere Cubilia Curae; LLP"),
        Person(id = 30, name = "Kamal Morrison", phone = "(201) 219-8211", company = "Lobortis Quis Industries"),
        Person(id = 31, name = "Nathan Simon", phone = "(897) 548-7414", company = "Vitae Company"),
        Person(id = 32, name = "Lucius Larsen", phone = "(788) 436-5925", company = "Tempus Lorem Corp."),
        Person(id = 33, name = "Wing Mullins", phone = "(980) 988-5980", company = "Faucibus Orci LLP"),
        Person(id = 34, name = "Hayes Solomon", phone = "(516) 860-5811", company = "Elit Dictum Eu Corporation"),
        Person(id = 35, name = "Stewart Sosa", phone = "(671) 818-2760", company = "Interdum Sed  Incorporated"),
        Person(id = 36, name = "Henry Sims", phone = "(848) 589-9470", company = "Praesent Interdum LLP"),
        Person(id = 37, name = "Carter Alvarez", phone = "(532) 392-8558", company = "Rutrum Magna LLP"),
        Person(id = 38, name = "Octavius Sloan", phone = "(314) 106-4136", company = "Facilisis Ltd"),
        Person(id = 39, name = "Seth Tillman", phone = "(265) 902-6741", company = "In Consectetuer Industries"),
        Person(id = 40, name = "Nero Harding", phone = "(583) 971-6595", company = "Vitae Consulting"),
        Person(id = 41, name = "Drake Shelton", phone = "(737) 383-2861", company = "Nisl Elementum Corporation"),
        Person(id = 42, name = "Keane Matthews", phone = "(716) 245-5233", company = "Dis Parturient  Industries"),
        Person(id = 43, name = "Zahir Vinson", phone = "(305) 164-9245", company = "Eu Ligula Aenean Inc."),
        Person(id = 44, name = "Igor Summers", phone = "(531) 759-0649", company = "Nulla Ante Iaculis Consulting"),
        Person(id = 45, name = "Ezekiel Oneil", phone = "(969) 925-0835", company = "Risus Donec LLP"),
        Person(id = 46, name = "Christopher Fuentes", phone = "(325) 144-4851", company = "Justo Nec  Incorporated"),
        Person(id = 47, name = "Laith Welch", phone = "(943) 620-3190", company = "Et Corporation"),
        Person(id = 48, name = "Nigel Gutierrez", phone = "(459) 858-3702", company = "Vitae Dolor Donec PC"),
        Person(id = 49, name = "Octavius Henson", phone = "(854) 192-0851", company = "In Consectetuer Ltd"),
        Person(id = 50, name = "Bruce Vasquez", phone = "(846) 387-8075", company = "Nulla Tincidunt Institute"),
        Person(id = 51, name = "Giacomo Moss", phone = "(485) 728-4562", company = "Erat Etiam Limited"),
        Person(id = 52, name = "Gil Stark", phone = "(413) 340-0224", company = "Nulla Facilisi Sed Foundation"),
        Person(id = 53, name = "Odysseus Merrill", phone = "(342) 806-9912", company = "Duis Dignissim Tempor LLC"),
        Person(id = 54, name = "Otto Justice", phone = "(131) 856-1424", company = "Blandit At Nisi Institute"),
        Person(id = 55, name = "Porter Mack", phone = "(516) 896-4859", company = "Nibh Corporation"),
        Person(id = 56, name = "Owen Gould", phone = "(732) 656-7747", company = "Mus Proin Vel Corporation"),
        Person(id = 57, name = "Harlan Bender", phone = "(831) 311-4830", company = "Praesent Ltd"),
        Person(id = 58, name = "Ferris Riddle", phone = "(543) 637-6070", company = "Sociis Natoque Penatibus Company"),
        Person(id = 59, name = "Caleb Anthony", phone = "(442) 791-4174", company = "Magna Lorem Foundation"),
        Person(id = 60, name = "Vance Juarez", phone = "(337) 157-8697", company = "Egestas Aliquam Nec Institute"),
        Person(id = 61, name = "Eric Wells", phone = "(633) 828-1997", company = "Odio Vel Ltd"),
        Person(id = 62, name = "Zachary Bryan", phone = "(814) 742-5218", company = "Ipsum Cursus Vestibulum Ltd"),
        Person(id = 63, name = "Valentine Kidd", phone = "(784) 666-1548", company = "Lorem Ipsum Dolor LLP"),
        Person(id = 64, name = "Brian Schroeder", phone = "(559) 422-7185", company = "Lacus Nulla Corporation"),
        Person(id = 65, name = "Alden Alvarado", phone = "(982) 712-9764", company = "Aliquet Diam Corp."),
        Person(id = 66, name = "Xenos Garrett", phone = "(132) 642-2126", company = "Nulla Cras LLC"),
        Person(id = 67, name = "Keefe Lowery", phone = "(377) 715-3473", company = "Vitae Dolor Limited"),
        Person(id = 68, name = "Nicholas Vaughn", phone = "(527) 963-2288", company = "Fames Ac Turpis LLP"),
        Person(id = 69, name = "Jarrod Lewis", phone = "(615) 516-7088", company = "Ante Institute"),
        Person(id = 70, name = "Aristotle Clay", phone = "(253) 674-2690", company = "Eget Massa Consulting"),
        Person(id = 71, name = "Cullen Woodard", phone = "(505) 217-1276", company = "Nam Interdum Company"),
        Person(id = 72, name = "Sawyer Evans", phone = "(448) 988-4172", company = "Mattis Semper Associates"),
        Person(id = 73, name = "Aladdin Benjamin", phone = "(771) 552-3143", company = "Dignissim LLC"),
        Person(id = 74, name = "Cain Brady", phone = "(849) 531-3632", company = "Suspendisse Ac Corporation"),
        Person(id = 75, name = "Colin Mercer", phone = "(651) 904-5129", company = "Mauris Eu Turpis LLP"),
        Person(id = 76, name = "Alan Kirby", phone = "(168) 463-8713", company = "Magna Duis Incorporated"),
        Person(id = 77, name = "Elijah Thomas", phone = "(887) 193-3608", company = "Ullamcorper Corporation"),
        Person(id = 78, name = "Jeremy Horne", phone = "(730) 577-4434", company = "Convallis Convallis Dolor LLP"),
        Person(id = 79, name = "Colt Henson", phone = "(474) 253-1239", company = "Velit Quisque Varius LLC"),
        Person(id = 80, name = "Rogan Holder", phone = "(495) 702-9862", company = "Dolor Industries"),
        Person(id = 81, name = "Stewart Morales", phone = "(584) 928-1184", company = "Fusce Corporation"),
        Person(id = 82, name = "Lev Franco", phone = "(328) 148-4128", company = "Magna Malesuada Associates"),
        Person(id = 83, name = "Benedict Baxter", phone = "(842) 258-9848", company = "Porttitor Eros Nec Company"),
        Person(id = 84, name = "Trevor Goodman", phone = "(408) 831-2869", company = "Tellus Company"),
        Person(id = 85, name = "Rogan Valencia", phone = "(442) 170-6020", company = "Leo In Associates"),
        Person(id = 86, name = "Chandler Hill", phone = "(522) 192-1140", company = "Massa Lobortis LLP"),
        Person(id = 87, name = "Conan Rosa", phone = "(952) 395-3918", company = "Phasellus Ltd"),
        Person(id = 88, name = "Branden Lloyd", phone = "(511) 753-4459", company = "Non Lacinia LLP"),
        Person(id = 89, name = "Dillon Navarro", phone = "(222) 229-1546", company = "Aliquam Adipiscing Inc."),
        Person(id = 90, name = "Wesley Love", phone = "(675) 182-0844", company = "Nisi Incorporated"),
        Person(id = 91, name = "Oleg Ray", phone = "(978) 699-0720", company = "Tellus Lorem Eu Consulting"),
        Person(id = 92, name = "Rahim Boyle", phone = "(700) 959-6066", company = "Nonummy Ultricies  Foundation"),
        Person(id = 93, name = "Kaseem Munoz", phone = "(856) 901-0733", company = "Pretium Et Corporation"),
        Person(id = 94, name = "Amal Todd", phone = "(839) 687-9510", company = "Dapibus Quam Corporation"),
        Person(id = 95, name = "Sawyer Sherman", phone = "(616) 972-5774", company = "Arcu Sed Company"),
        Person(id = 96, name = "Damon Vance", phone = "(698) 783-4951", company = "Adipiscing Enim Mi Limited"),
        Person(id = 97, name = "Brenden Kirkland", phone = "(361) 131-3331", company = "Quam Pharetra Institute"),
        Person(id = 98, name = "Hayden Chavez", phone = "(247) 641-5504", company = "Fusce Aliquam Enim Inc."),
        Person(id = 99, name = "Ryan Walls", phone = "(673) 828-0551", company = "Orci Sem Corporation"),
        Person(id = 100, name = "Quamar Cain", phone = "(650) 464-5500", company = "Interdum LLC")
    )
}
