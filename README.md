# beer_can_outlook
Short and Sweet : Turns any sentence into a beercan sentence.

# Details

On many Beer cans, particularly those from craft brewers their exists a description of the beer.

A description so effuse, vague, poetic and ideally insubstantial that it will bring joy and confusion to the readers taste buds.

This application is attempting to pay homage to this practice by recording, learning and then replicating this specific sentence structure.

---

# Features. 

The project will consist of two main features. 
  * Data Upload : allowing users to upload beer can descrptions to a shared database.
  * Sentence Transformation : Taking a provided paragraph / sentence and transforming it into a beer can sentence. 

## Data Collection

To collect data a few moving parts need to be assembeled. The following are the moving parts required. 
  * Image collection. Which includes 
    * Image picking 
    * Maybe Image cropping
    * Maybe Image resizeing on static images. 
  * Automatic or manual catagorizing (or both) of the brewery / beer type imformation.
  * OCR on the image. 
  * Storing the information. 
    * Locally.
    * And then ideally, connecting to a distributed API or DB containing the rest of the stored sentences.

## Sentence Transformation.

To transform a normal sentence into a perfect beer-can-like sentence.

This will be a new experience for me and like with all technology, there will be a wide spectrum of possible solutions with varying effectiveness / effort / learning requried. 

I have seen a few implementation of similar transforming sentence projects and they used a simple substitution based solution that while effective and simple, is more rigid and only worked when users responded to specific questions. Another option may be the existance of already created libraries that allow subsitution of nouns/verbs. While another option would be to role up my sleves and get into some AI solutions involving natural language processing, however this would undoubtedly be the most time consuming and diffacult option. 

However, i will cross this bridge when necessary. For now Data Collection remains the primary focus.
