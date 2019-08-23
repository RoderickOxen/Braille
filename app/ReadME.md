Programmer & Author : Rodrigo Nobre
Contact: roderickoxen@gmail.com

Project Name: Brailler Helper

Description:




Technical Description:

    Braille Engine:
        Classes:
            The main engine is in the Braille Engine and all the auxiliary functions are in AuxFunctions
            The classes Alphabet, Numbers and Punctuation are a switch case to convert the chars into braille (explanation after).


        Algorithm:
            1. Given an input text it's converted into an array of chars

            2. For each char 'x' in the array it is seen if it is either : Alphabet, Number or Punctuation

            3. When chosen, it is create a matrix 3x2 of zeros and ones that represent the letter in braille : 1 0       .
                                                                                                               0 0 = A =
                                                                                                               0 0

            4. This is done for every char, and each time the array 3x2 is added to a matrix of matrices 3x2

            5. In the end the matrix of matrices is traversed to be outputted, this is done by going throw the matrix of matrices 3x2 in this way:
                      i)   First going throw the first line of each 3x2 matrix
                      ii)  Then going throw the second line of each matrix 3x2
                      iii) And finally going throw the third line of each matrix
               So the output is constructed in this way:    .  .   .   ->  .  .   .  -> .  .   .
                                                                           .  .   .     .  .   .
                                                                                        .  .   .
