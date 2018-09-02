require_relative "spec_helper"

describe Solution do
  describe "#solve - 0" do
    let(:words) { ["This", "is", "an", "example", "of", "text", "justification."] }
    let(:maxWidth) { 16 }
    let(:output) {
      [
         "This    is    an",
         "example  of text",
         "justification.  "
      ]
    }
    subject { described_class.new words, maxWidth }

    it "should return the correct output" do
      expect(subject.solve).to eq output
    end
  end

  describe "#solve - 1" do
    let(:words) { ["What","must","be","acknowledgment","shall","be"] }
    let(:maxWidth) { 16 }
    let(:output) {
        [
          "What   must   be",
          "acknowledgment  ",
          "shall be        "
        ]
    }
    subject { described_class.new words, maxWidth }

    it "should return the correct output" do
      expect(subject.solve).to eq output
    end
  end

  describe "#solve - 2" do
    let(:words) { ["Science","is","what","we","understand","well","enough","to","explain",
         "to","a","computer.","Art","is","everything","else","we","do"] }
    let(:maxWidth) { 20 }
    let(:output) {
        [
          "Science  is  what we",
          "understand      well",
          "enough to explain to",
          "a  computer.  Art is",
          "everything  else  we",
          "do                  "
        ]
    }
    subject { described_class.new words, maxWidth }

    it "should return the correct output" do
      expect(subject.solve).to eq output
    end
  end
end
