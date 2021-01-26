'''
- VGGFace2 Dataset: New large scale face recognition dataset with 9131 identities and over 3.3 million faces. 
- Images are downloaded from Google Image Search and have large variations in pose, age, illumination, ethnicity, and profession. 
- Each identity is named as 'n< classID >' with 6 digits padding with zeros, e.g. 'n000001'.
- Each face image has unique name, e.g. 'n000001/0019_01.jpg', where '0019_01.jpg' is named in a way '< imageID >_< faceID >.jpg'.
'''

import csv
import pandas as pd

df = pd.read_csv('identity_meta.csv', encoding='utf8', sep='\s*,\s*', engine='python')

print('\n-------------------------------------------------------------')

print('identity_meta.csv: \n')
total_identities = df['Class_ID'].count()
print(str(total_identities) + ' identities in this dataset.')

sum_samplenum = df['Sample_Num'].sum()
print(str(sum_samplenum) + ' faces in this dataset.\n')

groupby_flag = df.groupby(['Flag'])['Flag'].count()
print('Train/Test ' + groupby_flag.to_string() + '\n')

groupby_gender = df.groupby(['Gender'])['Gender'].count()
print(groupby_gender.to_string() + '\n')

print('-------------------------------------------------------------\n')

def getAttributeData(filename):
    atrb = pd.read_csv(filename, encoding='utf8', sep='\t', engine='python')
    atrb.columns = ['Image', 'Flag']
    sum = atrb['Flag'].sum()
    print(filename + ':')
    return sum

print(str(getAttributeData('01-Male.txt')) + ' images of males.\n')
print(str(getAttributeData('02-Black_Hair.txt')) + ' images with black hair.\n')
print(str(getAttributeData('03-Brown_Hair.txt')) + ' images with brown hair.\n')
print(str(getAttributeData('04-Gray_Hair.txt')) + ' images with gray hair.\n')
print(str(getAttributeData('05-Blond_Hair.txt')) + ' images with blond hair.\n')
print(str(getAttributeData('06-Long_Hair.txt')) + ' images with long hair.\n')
print(str(getAttributeData('07-Mustache_or_Beard.txt')) + ' images with a mustache or beard.\n')
print(str(getAttributeData('08-Wearing_Hat.txt')) + ' images with a hat.\n')
print(str(getAttributeData('09-Eyeglasses.txt')) + ' images with eyeglasses.\n')
print(str(getAttributeData('10-Sunglasses.txt')) + ' images with sunglasses.\n')
print(str(getAttributeData('11-Mouth_Open.txt')) + ' images with mouth open.\n')
