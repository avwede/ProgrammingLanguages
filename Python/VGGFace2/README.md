# VGGFace2 Dataset - Sighthound

This was a simple python script I wrote to parse through CSV and text files and collect data on the VGGFace2 Dataset.


VGGFace2 Dataset: New large scale face recognition dataset with 9131 identities and over 3.3 million faces. 
- Images are downloaded from Google Image Search and have large variations in pose, age, illumination, ethnicity, and profession. 
- Each identity is named as 'n< classID >' with 6 digits padding with zeros, e.g. 'n000001'.
- Each face image has unique name, e.g. 'n000001/0019_01.jpg', where '0019_01.jpg' is named in a way '< imageID >_< faceID >.jpg'.
