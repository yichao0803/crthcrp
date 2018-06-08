package com.bjgoodwill.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author Zhangyichao
*/
public class TStudent implements Serializable {

    private static final long serialVersionUID = 1528360808560L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer StudnetID;

    /**
    * 
    * isNullAble:1
    */
    private String Name;

    /**
    * 
    * isNullAble:1
    */
    private Integer Age;


    public void setStudnetID(Integer StudnetID){
        this.StudnetID = StudnetID;
    }

    public Integer getStudnetID(){
        return this.StudnetID;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getName(){
        return this.Name;
    }

    public void setAge(Integer Age){
        this.Age = Age;
    }

    public Integer getAge(){
        return this.Age;
    }
    @Override
    public String toString() {
        return "TStudent{" +
                "StudnetID='" + StudnetID + '\'' +
                "Name='" + Name + '\'' +
                "Age='" + Age + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends TStudent{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Integer> StudnetIDList;

        private Integer StudnetIDSt;

        private Integer StudnetIDEd;

        public Integer getStudnetIDSt(){
            return this.StudnetIDSt;
        }

        public Integer getStudnetIDEd(){
            return this.StudnetIDEd;
        }

        private List<String> NameList;


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){
            return this.fuzzyName;
        }

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){
            return this.rightFuzzyName;
        }
        private List<Integer> AgeList;

        private Integer AgeSt;

        private Integer AgeEd;

        public Integer getAgeSt(){
            return this.AgeSt;
        }

        public Integer getAgeEd(){
            return this.AgeEd;
        }

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder StudnetIDBetWeen(Integer StudnetIDSt,Integer StudnetIDEd){
            this.StudnetIDSt = StudnetIDSt;
            this.StudnetIDEd = StudnetIDEd;
            return this;
        }

        public QueryBuilder StudnetIDGreaterEqThan(Integer StudnetIDSt){
            this.StudnetIDSt = StudnetIDSt;
            return this;
        }
        public QueryBuilder StudnetIDLessEqThan(Integer StudnetIDEd){
            this.StudnetIDEd = StudnetIDEd;
            return this;
        }


        public QueryBuilder StudnetID(Integer StudnetID){
            setStudnetID(StudnetID);
            return this;
        }

        public QueryBuilder StudnetIDList(Integer ... StudnetID){
            if (StudnetID != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : StudnetID){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.StudnetIDList = list;
            }

            return this;
        }

        public QueryBuilder StudnetIDList(List<Integer> StudnetID){
            this.StudnetIDList = StudnetID;
            return this;
        }

        public QueryBuilder fetchStudnetID(){
            setFetchFields("fetchFields","StudnetID");
            return this;
        }

        public QueryBuilder excludeStudnetID(){
            setFetchFields("excludeFields","StudnetID");
            return this;
        }



        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            if (fuzzyName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            if (rightFuzzyName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyName = list;
            }
            return this;
        }

        public QueryBuilder Name(String Name){
            setName(Name);
            return this;
        }

        public QueryBuilder NameList(String ... Name){
            if (Name != null){
                List<String> list = new ArrayList<>();
                for (String item : Name){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.NameList = list;
            }

            return this;
        }

        public QueryBuilder NameList(List<String> Name){
            this.NameList = Name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","Name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","Name");
            return this;
        }



        public QueryBuilder AgeBetWeen(Integer AgeSt,Integer AgeEd){
            this.AgeSt = AgeSt;
            this.AgeEd = AgeEd;
            return this;
        }

        public QueryBuilder AgeGreaterEqThan(Integer AgeSt){
            this.AgeSt = AgeSt;
            return this;
        }
        public QueryBuilder AgeLessEqThan(Integer AgeEd){
            this.AgeEd = AgeEd;
            return this;
        }


        public QueryBuilder Age(Integer Age){
            setAge(Age);
            return this;
        }

        public QueryBuilder AgeList(Integer ... Age){
            if (Age != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : Age){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.AgeList = list;
            }

            return this;
        }

        public QueryBuilder AgeList(List<Integer> Age){
            this.AgeList = Age;
            return this;
        }

        public QueryBuilder fetchAge(){
            setFetchFields("fetchFields","Age");
            return this;
        }

        public QueryBuilder excludeAge(){
            setFetchFields("excludeFields","Age");
            return this;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public TStudent build(){
            return this;
        }
    }

}
