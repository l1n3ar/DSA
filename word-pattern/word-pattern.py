class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        words = s.split(" ")
        letter_to_word = dict()

        if (len(pattern)!=len(words)):
            return False
        
        if (len(set(pattern))!=len(set(words))):
            return False

        for index,letter in enumerate(pattern):

            if (letter in letter_to_word and letter_to_word[letter]!=words[index]):
                return False

            letter_to_word[letter] = words[index]

        print(letter_to_word)

        return True